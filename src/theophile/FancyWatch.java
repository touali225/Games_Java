package theophile;

public class FancyWatch {
    static int count = 0;
    int usages = 0;

    public FancyWatch() {
        count+=1;
    }

    public void wear() {
        this.usages += 1;
    }

    public static void main(String[] args) {
        FancyWatch myWatch = new FancyWatch();
        myWatch.wear();

        FancyWatch joeWatch = new FancyWatch();
        for (int i=0;i<5;i++) {
            joeWatch.wear();
        }
        System.out.println(joeWatch);

        FancyWatch jennyWatch = new FancyWatch();

    }

}
