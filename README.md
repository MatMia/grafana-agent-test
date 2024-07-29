# This project consists of 4 modules:

* test-app:
    Sample, simple Spring Boot application, which exposes prometheus metrics under 'localhost:8080/actuator/prometheus'. It needs to be run locally using *mvn run*.

* prometheus-remote-write-receiver:
    Prometheus instance with remote-write-receiver flag enabled. It expose endpoint, which is used by grafana agent to push metrics into.
    It needs to be started using docker compose (docker compose up -d) from module folder.
    Target application metrics are available under 'localhost:9090'.

* grafana-agent:
    Agent, which scrapes metrics from sample Spring Boot application and pushes it into Prometheus remote-write-receiver instance
    It needs to be started using docker compose (docker compose up -d) from module folder.

* prometheus:
    Agent, which mirrors grafana-agent functionality, but using basic prometheus instance
    It needs to be started using docker compose (docker compose up -d) from module folder.

# Run options

There are two combinations for end to end flow:

1. test-app -> grafana-agent -> prometheus-remote-write-receiver
2. test-app -> prometheus -> prometheus-remote-write-receiver