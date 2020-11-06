![Issues](https://img.shields.io/github/issues/ricardohsmello/k6-stress-test) 
![Forks](https://img.shields.io/github/forks/ricardohsmello/k6-stress-test) 
![Stars](https://img.shields.io/github/stars/ricardohsmello/k6-stress-test) 
![Release Version](https://img.shields.io/github/release/ricardohsmello/k6-stress-test)

# k6-stress-test project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Technologies

- [`Quarkus`](https://quarkus.io/) - Framework
- [`k6`](https://k6.io/) - K6 

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
