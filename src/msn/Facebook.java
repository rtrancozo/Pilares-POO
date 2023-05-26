package msn;

public class Facebook extends ServicoMensagemInstantanea{

    @Override
    protected void validarConectadoInternet() {
        super.validarConectadoInternet();
    }

    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo Facebook Messenger");
    }


    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook Messenger");
    }



}
