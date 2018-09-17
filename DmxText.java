public class DmxTest {
	public static void main(String[] args) {
		// Local constants
		
		// Local variables
		DmxJava dmx = new DmxJava();
		byte[] dmxPacket;
		
		/****** start DmxTest() ******/
		dmx.setChannel(1, 255);
		dmx.setChannel(289, 155);
		dmxPacket = dmx.render();
		dmx.printPacket(dmxPacket);
		
		dmx.setChannel(90, 0);
		dmx.blackout();
		dmxPacket = dmx.render();
		dmx.printPacket(dmxPacket);
	}
}