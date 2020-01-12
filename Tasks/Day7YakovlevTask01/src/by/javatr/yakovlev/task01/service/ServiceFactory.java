package by.javatr.yakovlev.task01.service;

import by.javatr.yakovlev.task01.service.filter.*;
import by.javatr.yakovlev.task01.service.filter.impl.EveryDigitIsDifferentFilter;
import by.javatr.yakovlev.task01.service.filter.impl.FibonacciFilter;
import by.javatr.yakovlev.task01.service.filter.impl.PrimeNumberFilter;
import by.javatr.yakovlev.task01.service.filter.impl.TriDigitFilter;
import by.javatr.yakovlev.task01.service.impl.Logic;
import by.javatr.yakovlev.task01.service.sort_method.impl.Bubble;
import by.javatr.yakovlev.task01.service.sort_method.impl.Comb;
import by.javatr.yakovlev.task01.service.sort_method.ISortMethod;

public class ServiceFactory {

    private static final ServiceFactory instance = new ServiceFactory();

    private ServiceFactory(){}

    public static ServiceFactory getInstance(){
        return instance;
    }

    public IFilter getPrimeNumberFilter(){
        IFilter filter = new PrimeNumberFilter();
        return filter;
    }

    public IFilter getFibonacciFilter(){
        IFilter filter = new FibonacciFilter();
        return filter;
    }

    public IFilter getEveryDigitIsDifferentFilter(){
        IFilter filter = new EveryDigitIsDifferentFilter();
        return filter;
    }

    public IFilter getTriDigitFilter(){
        IFilter filter = new TriDigitFilter();
        return filter;
    }

    public ILogic getLogic(){
        ILogic logic = new Logic();
        return logic;
    }

    public ISortMethod getBubbleSortMethod(){
        ISortMethod bubble = new Bubble();
        return bubble;
    }

    public ISortMethod getCombSortMethod(){
        ISortMethod comb = new Comb();
        return comb;
    }

    public ISortMethod getSelectSortMethod(){
        ISortMethod select = new Comb();
        return select;
    }
}
