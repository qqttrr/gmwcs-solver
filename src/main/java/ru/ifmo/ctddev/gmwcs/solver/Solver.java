package ru.ifmo.ctddev.gmwcs.solver;

import ru.ifmo.ctddev.gmwcs.TimeLimit;
import ru.ifmo.ctddev.gmwcs.graph.Graph;
import ru.ifmo.ctddev.gmwcs.graph.Unit;

import java.util.List;

public interface Solver {
    List<Unit> solve(Graph graph) throws SolverException;

    void setTimeLimit(TimeLimit tl);

    boolean isSolvedToOptimality();

    void suppressOutput();

    void setLB(double lb);
}
