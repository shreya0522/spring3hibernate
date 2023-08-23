#!/usr/bin/env groovy

def mvnPackage() {
  sh 'mvn clean package'
}

def mvnTest() {
  sh 'mvn test'
}
