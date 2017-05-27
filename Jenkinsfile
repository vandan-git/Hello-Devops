pipeline {
    agent any
    stages {
        stage('build') {
            steps {
		sh 'echo "Building MyStrings.java"'
                sh '/usr/bin/javac MyStrings.java'
            }
        }
    }
}
