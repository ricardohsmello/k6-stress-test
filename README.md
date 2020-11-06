![Issues](https://img.shields.io/github/issues/ricardohsmello/k6-stress-test) 
![Forks](https://img.shields.io/github/forks/ricardohsmello/k6-stress-test) 
![Stars](https://img.shields.io/github/stars/ricardohsmello/k6-stress-test) 
![Release Version](https://img.shields.io/github/release/ricardohsmello/k6-stress-test)

# k6-stress-test

This project was created to simulate the use of the k6 test. There is an endpointthat creates a map with a sequence of integers. After this endpoint is up, scritp.js executes the tests, stressing it according to the variables informed during the run.

## Technologies

- [`Quarkus`](https://quarkus.io/) - Framework
- [`k6`](https://k6.io/) - K6 

## Prerequisites
- [`Jdk11`](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) - Language

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./gradlew quarkusDev
```

## Running k6 stress test


Inside k6-stress-test directory, run script.js:
```
TOTAL=15 k6 run --vus 10 --duration 30s script.js
```
 - TOTAL = number of iterations that intStream will use to generate map content
 - vus = number of virtual user (k6 documentation)
 - duration = duration of test (k6 documentation)
