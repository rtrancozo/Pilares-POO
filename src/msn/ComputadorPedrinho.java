package msn;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

		/*
		    NÃO SE SABE QUAL APP
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
        String appEscolhido="tlg";

        if(appEscolhido.equals("msn"))
            smi = new Msn();
        else if(appEscolhido.equals("fcb"))
            smi = new Facebook();
        else if(appEscolhido.equals("tlg"))
            smi = new Telegram();



        smi.validarConectadoInternet();
        System.out.println();


        smi.enviarMensagem();
        smi.receberMensagem();

    }


    }

