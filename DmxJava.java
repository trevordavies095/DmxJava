import java.util.Arrays;

public class DmxJava {
    private byte[] dmxData = new byte[519];

    public DmxJava() {
        dmxData[0] = 126;
        dmxData[1] = 6;
        dmxData[2] = 1;
        dmxData[3] = 2;
        dmxData[4] = 0;
        dmxData[518] = (byte)231;
    }

    public void setChannel(int chan, int intensity) {
        if(chan > 512)
            chan = 512;
        else if(chan < 1)
            chan = 1;
        if(intensity > 255)
            intensity = 255;
        else if(intensity < 0)
            intensity = 0;

        dmxData[chan+4] = (byte)intensity;

    }

    public int getChannel(int chan) {
        if(chan > 512)
            chan = 512;
        else if(chan < 0)
            chan = 0;

        return dmxData[chan+4];
    }

    public void blackout() {
        for(int i = 1; i < 513; i++)
            dmxData[i+4] = (byte)0;
    }

    public byte[] init1() {
        byte[] init1 = {126, 3, 2, 0, 0, 0, (byte)231};
        return init1;
    }

    public byte[] init2() {
        byte[] init2 = {126, 10, 2, 0, 0, 0, (byte)231};
        return init2;
    }

    public byte[] render() {
        return dmxData;
    }

    public void printPacket(byte[] i){
        System.out.println(Arrays.toString(i));
    }
}
