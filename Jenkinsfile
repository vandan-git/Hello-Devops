pipeline {
    agent any
    stages {
        stage('build') {
            steps {
		sh 'echo "Building MyStrings.java"'
                sh '/usr/bin/javac /Users/MilindJoshi/MyStuff/Hello-Devops/MyStrings.java'
		sh '/usr/bin/jar -cvfm MyStrings.jar manifest.txt MyStrings.class'
		sh '/usr/bin/jar -cvf /Users/MilinJoshi/MyStuff/Hello-Devops/MyStrings.war *'
            }
        }
    }
}
