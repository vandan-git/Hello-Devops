pipeline {
    agent any
    stages {
        stage('build') {
            steps {
		sh 'echo "Building MyStrings.java"'
                sh '/usr/bin/javac /Users/MilindJoshi/MyStuff/Hello-Devops/MyStrings.java'
		sh '/usr/bin/javac jar -file /Users/MilindJoshi/MyStuff/Hello-Devops/MyStrings.class'
		sh '/usr/bin/jar -cvf /USers/MilinJoshi/MyStuff/Hello-Devops/MyStrings.war *'
            }
        }
    }
}
