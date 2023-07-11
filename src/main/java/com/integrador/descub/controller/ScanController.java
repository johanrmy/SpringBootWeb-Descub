package com.integrador.descub.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.integrador.descub.model.Mural;
import com.integrador.descub.model.Muralista;
import com.integrador.descub.model.Scan;
import com.integrador.descub.service.MuralService;
import com.integrador.descub.service.ScanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("mural")
@CrossOrigin(origins = "http://localhost:5173")
public class ScanController {

    @Autowired
    ScanService scanService;
    @Autowired
    MuralService muralService;

    @RequestMapping(value = "getMuralesIdUsuario/{id_usuario}")
    public List<Scan> getMuralesIdUsuario(@PathVariable Integer id_usuario){return scanService.getMuralesIdUsuario(id_usuario);}

    @RequestMapping(value = "getMuralesIdMural/{id_mural}")
    public Map<String, Integer> getMuralesIdMural(@PathVariable Integer id_mural) {
        List<Scan> scans = scanService.getMuralesIdMural(id_mural);
        int numeroScans = scans.size();
        Map<String, Integer> result = new HashMap<>();
        result.put("scans", numeroScans);

        return result;
    }

    @RequestMapping(value = "getScanId/{id}")
    public Scan getScanId(@PathVariable Integer id){
        return scanService.getScanId(id);
    }

    @GetMapping("/ScansPorMes")
    public List<Map<String, Object>> getScansPerMonth() {
        List<Scan> scans = scanService.getAllScan();

        Map<String, Integer> scansPerMonth = new HashMap<>();

        for (Scan scan : scans) {
            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            calendar.setTime(scan.getFecha_registro());
            int month = calendar.get(Calendar.MONTH) + 1;
            String key = String.format("%04d-%02d", calendar.get(Calendar.YEAR), month);
            scansPerMonth.put(key, scansPerMonth.getOrDefault(key, 0) + 1);
        }
        List<Map<String, Object>> result = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : scansPerMonth.entrySet()) {
            String month = entry.getKey();
            Integer scanCount = entry.getValue();

            Map<String, Object> scanInfo = new HashMap<>();
            scanInfo.put("mes", month);
            scanInfo.put("scans", scanCount);

            result.add(scanInfo);
        }
        Collections.sort(result, Comparator.comparing(o -> (String) o.get("mes")));
        return result;
    }

    @GetMapping("/getMuralesEmailUsuario/{email}")
    public List<Scan> getScannedMuralsByEmail(@PathVariable String email) {
        return scanService.getScannedMuralsByEmail(email);
    }

    @GetMapping("/scansPorIdMuralista/{idMuralista}")
    public Map<String, Integer> obtenerNumeroScansPorIdMuralista(@PathVariable Integer idMuralista) {
        List<Mural> murales = muralService.getMuralsByMuralistaId(idMuralista);
        int numeroScans = 0;

        for (Mural mural : murales) {
            List<Scan> scans = scanService.getMuralesIdMural(mural.getId());
            numeroScans += scans.size();
        }

        Map<String, Integer> respuesta = new HashMap<>();
        respuesta.put("scans", numeroScans);

        return respuesta;
    }
}
