package org.projectodd.linkfusion;

public interface StrategyChain {
    
    InvocationRequest getRequest();
    StrategicLink nextStrategy() throws NoSuchMethodException, IllegalAccessException;
    StrategicLink nextStrategy(InvocationRequest request) throws NoSuchMethodException, IllegalAccessException;

}
