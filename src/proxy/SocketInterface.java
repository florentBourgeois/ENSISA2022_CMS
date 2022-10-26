package proxy;

interface SocketInterface {
    String readLine();
    void  writeLine(String str);
    void  dispose();
}
