package cl.portafolio.hostalapp.models.entity.list;

import cl.portafolio.hostalapp.models.entity.Empresa;

import java.util.List;

public class EmpresaList {

    private List<Empresa> empresas;

    public EmpresaList(List<Empresa> empresas) {
        this.empresas = empresas;
    }

    public EmpresaList() {
    }

    public List<Empresa> getEmpresas() {
        return empresas;
    }
}
