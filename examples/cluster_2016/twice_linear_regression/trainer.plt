trainer twice_b_regression;
    data
        a, b using file(twice_ab.csv);
    model
        features: a,
        labels: b;
        algorithm: LinearRegression;
        training: offline;
end