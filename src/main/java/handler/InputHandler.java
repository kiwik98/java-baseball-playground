package handler;

public interface InputHandler<T> {

    String command();

    T solve();
}
