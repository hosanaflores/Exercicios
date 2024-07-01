package school.sptech;
import school.sptech.especialistas.DesenvolvedorMobile;
import school.sptech.especialistas.DesenvolvedorWeb;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Consultoria {

    private List<Desenvolvedor> desenvolvedores;

    private String nome;
    private Integer vagas;

    public Consultoria(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        desenvolvedores = new ArrayList<>();
    }

    public Consultoria() {
        desenvolvedores = new ArrayList<>();
    }

    public void contratar(Desenvolvedor desenvolvedor) {
        Integer vagasDisponiveis = this.vagas - desenvolvedores.size();
        if (vagasDisponiveis > 0) {
            desenvolvedores.add(desenvolvedor);
        }
    }

    public void contratarFullstack(DesenvolvedorWeb desenvolvedor) {
        Integer vagasDisponiveis = this.vagas - desenvolvedores.size();
        if (desenvolvedor.isFullstack() && vagasDisponiveis > 0) {
            desenvolvedores.add(desenvolvedor);
        }

    }

    public Double getTotalSalarios() {
      Double salarioTotalDev = 0.0;
        for (Desenvolvedor desenvolvedorDaVez : desenvolvedores) {
            salarioTotalDev += desenvolvedorDaVez.calcularSalario();

            }
         return salarioTotalDev;
        }

    public Integer qtdDesenvolvedoresMobile() {
        Integer quantidadeDevMob = 0;
        for (Desenvolvedor desenvolvedorMob : desenvolvedores) {
            if (desenvolvedorMob instanceof DesenvolvedorMobile) {
                quantidadeDevMob++;
            }
        }
        return quantidadeDevMob;
    }

    public List<Desenvolvedor> buscarPorSalarioMaiorQue(Double salario) {
        List<Desenvolvedor> dev = new ArrayList<>();
            for (Desenvolvedor desenvolvedorDaVez : desenvolvedores) {
                    if (desenvolvedorDaVez.calcularSalario() >= salario ) {
                        dev.add(desenvolvedorDaVez);
                    }
            }
        return dev;
    }

    public Desenvolvedor buscarMenorSalario() {
        if (desenvolvedores.isEmpty()) {
            return null;
        }
        Desenvolvedor dev = desenvolvedores.get(0);
        Double menor = desenvolvedores.get(0).calcularSalario();

        for (Desenvolvedor desenvolvedorDaVez : desenvolvedores) {
                if (desenvolvedorDaVez.calcularSalario() < menor) {
                    menor = desenvolvedorDaVez.calcularSalario();
                    dev = desenvolvedorDaVez;
                }
        }
        return dev;
    }

    public List<Desenvolvedor> buscarPorTecnologia(String tecnologia) {
        List<Desenvolvedor> devs = new ArrayList<>();

        DesenvolvedorWeb devWeb;
        DesenvolvedorMobile devMob;

        for (Desenvolvedor desenvolvedorDaVez : desenvolvedores) {
            if (desenvolvedorDaVez instanceof DesenvolvedorWeb) {
                devWeb = (DesenvolvedorWeb) desenvolvedorDaVez;

                if (devWeb.getFrontend().equalsIgnoreCase(tecnologia)
                        || devWeb.getBackend().equalsIgnoreCase(tecnologia)
                        || devWeb.getSgbd().equalsIgnoreCase(tecnologia)) {
                    devs.add(devWeb);
                }

            } else if (desenvolvedorDaVez instanceof DesenvolvedorMobile) {
                devMob = (DesenvolvedorMobile) desenvolvedorDaVez;
                if (devMob.getLinguagem().equalsIgnoreCase(tecnologia) || devMob.getPlataforma().equalsIgnoreCase(tecnologia)) {
                    devs.add(devMob);
                }

            }
        }
        return devs;
    }

    public Double getTotalSalariosPorTecnologia(String tecnologia) {

        Double total = 0.0;
        DesenvolvedorWeb devWeb;
        DesenvolvedorMobile devMob;

        for(Desenvolvedor desenvolvedorDaVez : desenvolvedores){
            if(desenvolvedorDaVez instanceof DesenvolvedorWeb){
                devWeb = (DesenvolvedorWeb) desenvolvedorDaVez;

                if(devWeb.getFrontend().equalsIgnoreCase(tecnologia)
                        || devWeb.getBackend().equalsIgnoreCase(tecnologia)
                        || devWeb.getSgbd().equalsIgnoreCase(tecnologia)){
                    total += devWeb.calcularSalario();
                }

            } else if(desenvolvedorDaVez instanceof DesenvolvedorMobile) {
                devMob = (DesenvolvedorMobile) desenvolvedorDaVez;

                if(devMob.getPlataforma().equalsIgnoreCase(tecnologia) || devMob.getLinguagem().equalsIgnoreCase(tecnologia)){
                    total += devMob.calcularSalario();
                }
            }
        }

        return total;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

}
