package viewer;

public abstract class ConsoleMessageViewer implements MessageViewer {

    protected abstract String startMessage();
    protected abstract String readMessage();
    protected abstract String endMessage();
    protected abstract String restartMessage();

    @Override
    public void start() {
        System.out.println(startMessage());
    }

    @Override
    public void read() {
        System.out.print(readMessage());
    }

    @Override
    public void end() {
        System.out.println(endMessage());
    }

    @Override
    public void restart() {
        System.out.println(restartMessage());
    }


}
