package by.javatr.yakovlev.task01.service;

import by.javatr.yakovlev.task01.array.Array;
import by.javatr.yakovlev.task01.service.filter.IFilter;

public interface ILogic {

    Array createArray();

    Array filteredArray(Array array, IFilter filter);
}
