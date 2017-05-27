pipeline {
    agent any
    stages {
        stage('build') {
            steps {
		sh 'echo "Building MyStrings.java"'
                /usr/bin/javac MyStrings.java
            }
        }
    }
}
