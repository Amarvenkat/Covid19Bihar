package com.amar.covid19bihar.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class DistricData {

    @SerializedName("Araria")
    private Adilabad adilabad;
    @SerializedName("Arwal")
    private BhadradriKothagudem bhadradriKothagudem;
    @SerializedName("Aurangabad")
    private Hyderabad hyderabad;
    @SerializedName("Banka")
    private Jagtial jagtial;
    @SerializedName("Begusarai")
    private Jangaon jangaon;
    @SerializedName("Bhagalpur")
    private JayashankarBhupalapally jayashankarBhupalapally;
    @SerializedName("Bhojpur")
    private JogulambaGadwal jogulambaGadwal;
    @SerializedName("Buxar")
    private Kamareddy kamareddy;
    @SerializedName("Darbhanga")
    private Karimnagar karimnagar;
    @SerializedName("East Champaran")
    private Khammam khammam;
    @SerializedName("Gaya")
    private KomaramBheem komaramBheem;
    @SerializedName("Gopalganj")
    private Mahabubabad mahabubabad;
    @SerializedName("Jamui")
    private Mahabubnagar mahabubnagar;
    @SerializedName("Jehanabad")
    private Mancherial mancherial;
    @SerializedName("Kaimur")
    private Medak medak;
    @SerializedName("Katihar")
    private MedchalMalkajgiri medchalMalkajgiri;
    @SerializedName("Khagaria")
    private Mulugu mulugu;
    @SerializedName("Kishanganj")
    private Nagarkurnool nagarkurnool;
    @SerializedName("Lakhisarai")
    private Nalgonda nalgonda;
    @SerializedName("Madhepura")
    private Narayanpet narayanpet;
    @SerializedName("Madhubani")
    private Nirmal nirmal;
    @SerializedName("Munger")
    private Nizamabad nizamabad;
    @SerializedName("Muzaffarpur")
    private Peddapalli peddapalli;
    @SerializedName("Nalanda")
    private RajannaSircilla rajannaSircilla;
    @SerializedName("Nawada")
    private RangaReddy rangaReddy;
    @SerializedName("Patna")
    private Sangareddy sangareddy;
    @SerializedName("Purnia")
    private Siddipet siddipet;
    @SerializedName("Rohtas")
    private Suryapet suryapet;
    @SerializedName("Saharsa")
    private Vikarabad vikarabad;
    @SerializedName("Samastipur")
    private WarangalUrban warangalUrban;
    @SerializedName("Saran")
    private Unknown unknown;
    @SerializedName("Sheikhpura")
    private Sheikhpura sheikhpura;
    @SerializedName("Sheohar")
    private Sheohar sheohar;
    @SerializedName("Sitamarhi")
    private Sitamarhi sitamarhi;
    @SerializedName("Siwan")
    private Siwan siwan;
    @SerializedName("Supaul")
    private Supaul supaul;
    @SerializedName("Vaishali")
    private Vaishali vaishali;
    @SerializedName("West Champaran")
    private WestChamparan westChamparan;

    public DistricData(Adilabad adilabad, BhadradriKothagudem bhadradriKothagudem, Hyderabad hyderabad, Jagtial jagtial, Jangaon jangaon, JayashankarBhupalapally jayashankarBhupalapally, JogulambaGadwal jogulambaGadwal, Kamareddy kamareddy, Karimnagar karimnagar, Khammam khammam, KomaramBheem komaramBheem, Mahabubabad mahabubabad, Mahabubnagar mahabubnagar, Mancherial mancherial, Medak medak, MedchalMalkajgiri medchalMalkajgiri, Mulugu mulugu, Nagarkurnool nagarkurnool, Nalgonda nalgonda, Narayanpet narayanpet, Nirmal nirmal, Nizamabad nizamabad, Peddapalli peddapalli, RajannaSircilla rajannaSircilla, RangaReddy rangaReddy, Sangareddy sangareddy, Siddipet siddipet, Suryapet suryapet, Vikarabad vikarabad, WarangalUrban warangalUrban, Unknown unknown, Sheikhpura sheikhpura, Sheohar sheohar, Sitamarhi sitamarhi, Siwan siwan, Supaul supaul, Vaishali vaishali, WestChamparan westChamparan) {
        this.adilabad = adilabad;
        this.bhadradriKothagudem = bhadradriKothagudem;
        this.hyderabad = hyderabad;
        this.jagtial = jagtial;
        this.jangaon = jangaon;
        this.jayashankarBhupalapally = jayashankarBhupalapally;
        this.jogulambaGadwal = jogulambaGadwal;
        this.kamareddy = kamareddy;
        this.karimnagar = karimnagar;
        this.khammam = khammam;
        this.komaramBheem = komaramBheem;
        this.mahabubabad = mahabubabad;
        this.mahabubnagar = mahabubnagar;
        this.mancherial = mancherial;
        this.medak = medak;
        this.medchalMalkajgiri = medchalMalkajgiri;
        this.mulugu = mulugu;
        this.nagarkurnool = nagarkurnool;
        this.nalgonda = nalgonda;
        this.narayanpet = narayanpet;
        this.nirmal = nirmal;
        this.nizamabad = nizamabad;
        this.peddapalli = peddapalli;
        this.rajannaSircilla = rajannaSircilla;
        this.rangaReddy = rangaReddy;
        this.sangareddy = sangareddy;
        this.siddipet = siddipet;
        this.suryapet = suryapet;
        this.vikarabad = vikarabad;
        this.warangalUrban = warangalUrban;
        this.unknown = unknown;
        this.sheikhpura = sheikhpura;
        this.sheohar = sheohar;
        this.sitamarhi = sitamarhi;
        this.siwan = siwan;
        this.supaul = supaul;
        this.vaishali = vaishali;
        this.westChamparan = westChamparan;
    }

    public Adilabad getAdilabad() {
        return adilabad;
    }

    public void setAdilabad(Adilabad adilabad) {
        this.adilabad = adilabad;
    }

    public BhadradriKothagudem getBhadradriKothagudem() {
        return bhadradriKothagudem;
    }

    public void setBhadradriKothagudem(BhadradriKothagudem bhadradriKothagudem) {
        this.bhadradriKothagudem = bhadradriKothagudem;
    }

    public Hyderabad getHyderabad() {
        return hyderabad;
    }

    public void setHyderabad(Hyderabad hyderabad) {
        this.hyderabad = hyderabad;
    }

    public Jagtial getJagtial() {
        return jagtial;
    }

    public void setJagtial(Jagtial jagtial) {
        this.jagtial = jagtial;
    }

    public Jangaon getJangaon() {
        return jangaon;
    }

    public void setJangaon(Jangaon jangaon) {
        this.jangaon = jangaon;
    }

    public JayashankarBhupalapally getJayashankarBhupalapally() {
        return jayashankarBhupalapally;
    }

    public void setJayashankarBhupalapally(JayashankarBhupalapally jayashankarBhupalapally) {
        this.jayashankarBhupalapally = jayashankarBhupalapally;
    }

    public JogulambaGadwal getJogulambaGadwal() {
        return jogulambaGadwal;
    }

    public void setJogulambaGadwal(JogulambaGadwal jogulambaGadwal) {
        this.jogulambaGadwal = jogulambaGadwal;
    }

    public Kamareddy getKamareddy() {
        return kamareddy;
    }

    public void setKamareddy(Kamareddy kamareddy) {
        this.kamareddy = kamareddy;
    }

    public Karimnagar getKarimnagar() {
        return karimnagar;
    }

    public void setKarimnagar(Karimnagar karimnagar) {
        this.karimnagar = karimnagar;
    }

    public Khammam getKhammam() {
        return khammam;
    }

    public void setKhammam(Khammam khammam) {
        this.khammam = khammam;
    }

    public KomaramBheem getKomaramBheem() {
        return komaramBheem;
    }

    public void setKomaramBheem(KomaramBheem komaramBheem) {
        this.komaramBheem = komaramBheem;
    }

    public Mahabubabad getMahabubabad() {
        return mahabubabad;
    }

    public void setMahabubabad(Mahabubabad mahabubabad) {
        this.mahabubabad = mahabubabad;
    }

    public Mahabubnagar getMahabubnagar() {
        return mahabubnagar;
    }

    public void setMahabubnagar(Mahabubnagar mahabubnagar) {
        this.mahabubnagar = mahabubnagar;
    }

    public Mancherial getMancherial() {
        return mancherial;
    }

    public void setMancherial(Mancherial mancherial) {
        this.mancherial = mancherial;
    }

    public Medak getMedak() {
        return medak;
    }

    public void setMedak(Medak medak) {
        this.medak = medak;
    }

    public MedchalMalkajgiri getMedchalMalkajgiri() {
        return medchalMalkajgiri;
    }

    public void setMedchalMalkajgiri(MedchalMalkajgiri medchalMalkajgiri) {
        this.medchalMalkajgiri = medchalMalkajgiri;
    }

    public Mulugu getMulugu() {
        return mulugu;
    }

    public void setMulugu(Mulugu mulugu) {
        this.mulugu = mulugu;
    }

    public Nagarkurnool getNagarkurnool() {
        return nagarkurnool;
    }

    public void setNagarkurnool(Nagarkurnool nagarkurnool) {
        this.nagarkurnool = nagarkurnool;
    }

    public Nalgonda getNalgonda() {
        return nalgonda;
    }

    public void setNalgonda(Nalgonda nalgonda) {
        this.nalgonda = nalgonda;
    }

    public Narayanpet getNarayanpet() {
        return narayanpet;
    }

    public void setNarayanpet(Narayanpet narayanpet) {
        this.narayanpet = narayanpet;
    }

    public Nirmal getNirmal() {
        return nirmal;
    }

    public void setNirmal(Nirmal nirmal) {
        this.nirmal = nirmal;
    }

    public Nizamabad getNizamabad() {
        return nizamabad;
    }

    public void setNizamabad(Nizamabad nizamabad) {
        this.nizamabad = nizamabad;
    }

    public Peddapalli getPeddapalli() {
        return peddapalli;
    }

    public void setPeddapalli(Peddapalli peddapalli) {
        this.peddapalli = peddapalli;
    }

    public RajannaSircilla getRajannaSircilla() {
        return rajannaSircilla;
    }

    public void setRajannaSircilla(RajannaSircilla rajannaSircilla) {
        this.rajannaSircilla = rajannaSircilla;
    }

    public RangaReddy getRangaReddy() {
        return rangaReddy;
    }

    public void setRangaReddy(RangaReddy rangaReddy) {
        this.rangaReddy = rangaReddy;
    }

    public Sangareddy getSangareddy() {
        return sangareddy;
    }

    public void setSangareddy(Sangareddy sangareddy) {
        this.sangareddy = sangareddy;
    }

    public Siddipet getSiddipet() {
        return siddipet;
    }

    public void setSiddipet(Siddipet siddipet) {
        this.siddipet = siddipet;
    }

    public Suryapet getSuryapet() {
        return suryapet;
    }

    public void setSuryapet(Suryapet suryapet) {
        this.suryapet = suryapet;
    }

    public Vikarabad getVikarabad() {
        return vikarabad;
    }

    public void setVikarabad(Vikarabad vikarabad) {
        this.vikarabad = vikarabad;
    }

    public WarangalUrban getWarangalUrban() {
        return warangalUrban;
    }

    public void setWarangalUrban(WarangalUrban warangalUrban) {
        this.warangalUrban = warangalUrban;
    }

    public Unknown getUnknown() {
        return unknown;
    }

    public void setUnknown(Unknown unknown) {
        this.unknown = unknown;
    }

    public Sheikhpura getSheikhpura() {
        return sheikhpura;
    }

    public void setSheikhpura(Sheikhpura sheikhpura) {
        this.sheikhpura = sheikhpura;
    }

    public Sheohar getSheohar() {
        return sheohar;
    }

    public void setSheohar(Sheohar sheohar) {
        this.sheohar = sheohar;
    }

    public Sitamarhi getSitamarhi() {
        return sitamarhi;
    }

    public void setSitamarhi(Sitamarhi sitamarhi) {
        this.sitamarhi = sitamarhi;
    }

    public Siwan getSiwan() {
        return siwan;
    }

    public void setSiwan(Siwan siwan) {
        this.siwan = siwan;
    }

    public Supaul getSupaul() {
        return supaul;
    }

    public void setSupaul(Supaul supaul) {
        this.supaul = supaul;
    }

    public Vaishali getVaishali() {
        return vaishali;
    }

    public void setVaishali(Vaishali vaishali) {
        this.vaishali = vaishali;
    }

    public WestChamparan getWestChamparan() {
        return westChamparan;
    }

    public void setWestChamparan(WestChamparan westChamparan) {
        this.westChamparan = westChamparan;
    }
}
