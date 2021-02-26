#!/usr/bin/env sh

kind create cluster
helm repo add jenkins https://charts.jenkins.io
helm install jenkins -n jenkins --create-namespace -f values.yaml jenkins/jenkins
