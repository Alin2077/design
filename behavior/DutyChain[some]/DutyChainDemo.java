interface Handler {
    void setNextHandler(Handler nextHandler);
    void handleRequest(String request);
}

class HandlerOne implements Handler {
    private Handler nextHandler;
    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(String request) {
        if("one".equals(request)){
            System.out.println("HandlerOne handle :\t"+request);
        }else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}

class HandlerTwo implements Handler {
    private Handler nextHandler;
    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(String request) {
        if("two".equals(request)){
            System.out.println("HandlerTwo handle :\t"+request);
        }else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}

class HandlerThree implements Handler {
    private Handler nextHandler;
    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(String request) {
        if("three".equals(request)){
            System.out.println("HandlerThree handle :\t"+request);
        }else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}


public class DutyChainDemo {

    public static void main(String[] args) {
        HandlerOne handlerOne = new HandlerOne();
        HandlerTwo handlerTwo = new HandlerTwo();
        HandlerThree handlerThree = new HandlerThree();

        handlerOne.setNextHandler(handlerTwo);
        handlerTwo.setNextHandler(handlerThree);

        handlerOne.handleRequest("one");
        handlerOne.handleRequest("three");
        handlerOne.handleRequest("two");
    }

}