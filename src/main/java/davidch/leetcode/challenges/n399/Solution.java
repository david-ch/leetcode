package davidch.leetcode.challenges.n399;

import java.util.*;

public class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        final var graph = new HashMap<String, List<Expr>>();
        for (var i = 0; i < values.length; i++) {
            final var eq = equations.get(i);

            var exprs = graph.get(eq.get(0));
            exprs = exprs == null ? new ArrayList<>() : exprs;
            exprs.add(new Expr(eq.get(1), values[i]));
            graph.put(eq.get(0), exprs);

            exprs = graph.get(eq.get(1));
            exprs = exprs == null ? new ArrayList<>() : exprs;
            exprs.add(new Expr(eq.get(0), 1 / values[i]));
            graph.put(eq.get(1), exprs);
        }

        final var queriesNum = queries.size();
        final var result = new double[queriesNum];
        for (var i = 0; i < queriesNum; i++) {
            final var query = queries.get(i);
            result[i] = solveQuery(graph, query.get(0), query.get(1));
        }

        return result;
    }

    private double solveQuery(Map<String, List<Expr>> graph, String from, String to) {
        if (!graph.containsKey(from)) return -1;

        final Queue<Expr> q = new LinkedList<>();
        final var visited = new HashSet<String>();

        q.offer(new Expr(from, 1));
        visited.add(from);

        while (!q.isEmpty()) {
            final var step = q.poll();
            if (step.variable.equals(to)) return step.value;

            final var nextSteps = graph.get(step.variable);
            if (nextSteps == null) continue;

            for (var nextStep : nextSteps) {
                if (visited.contains(nextStep.variable)) continue;;
                q.offer(new Expr(nextStep.variable, step.value * nextStep.value));
                visited.add(nextStep.variable);
            }
        }

        return -1;
    }

    private record Expr(String variable, double value) {
    }
}
