package uz.itcenter.shifoxona.model;

public class Bemor {
    private int id;
    private String ism;
    private String familiya;
    private String sharif;
    private String kassalik;
    private String tugilganKun;
    private String yosh;


    public Bemor(){

    }

    public Bemor(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsm() {
        return ism;
    }

    public void setIsm(String ism) {
        this.ism = ism;
    }

    public String getFamiliya() {
        return familiya;
    }

    public void setFamiliya(String familiya) {
        this.familiya = familiya;
    }

    public String getSharif() {
        return sharif;
    }

    public void setSharif(String sharif) {
        this.sharif = sharif;
    }

    public String getKassalik() {
        return kassalik;
    }

    public void setKassalik(String kassalik) {
        this.kassalik = kassalik;
    }

    public String getTugilganKun() {
        return tugilganKun;
    }

    public void setTugilganKun(String tugilganKun) {
        this.tugilganKun = tugilganKun;
    }

    public String getYosh() {
        return yosh;
    }

    public void setYosh(String yosh) {
        this.yosh = yosh;
    }
}
