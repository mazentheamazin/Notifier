package io.mazenmc.notifier.packets;

public class PacketSimpleMessage extends Packet {

    private static final int id = 12;
    private String message;

    public PacketSimpleMessage(String message) {
        this.message = message;
    }

    public static int getID() {
        return id;
    }

    @Override
    public void handle() {}

    @Override
    public String toString() {
        return id + Packet.SPLITTER + Packet.SPLITTER + message;
    }
}
