# DmxJava - Java Controller for USB - DMX devices

This is a crappy port of [DmxPy](https://github.com/davepaul0/DmxPy) to Java.

Instantiate:
`DmxJava dmx = new DmxJava();`

Set a DMX address's value:
`dmx.setChannel(dmx_address, value);`

Receive DMX packet to be sent
`byte[] dmx_packet = dmx.render();` You can now send the packet to the ENTTEC using whatever serial libary you are using.
