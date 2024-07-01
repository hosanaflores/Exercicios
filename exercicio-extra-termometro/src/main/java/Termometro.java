public class Termometro {

    Double temperaturaAtual = 25.0;
    Double temperaturaMax = 40.0;
    Double temperaturaMin = 1.0;

    Double  aumentaTemperatura(Double aumentarTemperaturaAtual){
        if(aumentarTemperaturaAtual > temperaturaMax){
            temperaturaAtual = temperaturaMax;
        }
        return  temperaturaAtual;
    }

    Double  diminuiTemperatura(Double diminuirTemperaturaAtual){
        if(diminuirTemperaturaAtual  < temperaturaMin){
            temperaturaAtual = temperaturaMin;
        }
        return  temperaturaAtual;
    }

    Double exibeFahreinheit(){
        Double celsiusParaFahreinheit = (temperaturaAtual * 9/5) + 32;
        return celsiusParaFahreinheit;
    }

}
