package chainOfResponsibility;

/**
 * 定义处理请求的接口，并且实现后继链(successor)
 */
public abstract class Handler {

    protected Handler successor;

    public Handler(Handler successor) {
        this.successor = successor;
    }

    protected abstract void handleRequest(Request request);
}
