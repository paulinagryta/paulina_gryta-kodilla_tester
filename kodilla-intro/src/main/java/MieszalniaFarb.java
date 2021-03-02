public class MieszalniaFarb {
    private String result;

    public String mieszalnia() {
        String userSelected = PaletaBarw.getUserSelection();


        switch (userSelected) {
            case "niebieski":
                result = "niebieski";
                break;
            case "zielony":
                result = "zielony";
                break;
            case "bialy":
                result = "bialy";
                break;
            case "czerwony":
                result = "czerwony";
                break;
        }
        return result;
    }
}
