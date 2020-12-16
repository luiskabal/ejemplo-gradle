pipeline{
	agent any
	
	stages{
		stage('Hello'){
			steps{
				script{
					stage('build & test'){
					bat './gradlew clean build'
					
					}
					stage('sonar'){
						def scannerHome = tool 'sonar';
						withSonarQubeEnv('sonar') {
							bat "${scannerHome}\\bin\\sonar-scanner -Dsonar.projectKey=ejemplo-gradle -Dsonar.java.binaries=build"
						}
					}
					stage('run'){
					bat 'start gradlew bootRun'
					sleep 7
					}
					stage('test'){
						bat "curl -X GET http://localhost:8082/rest/mscovid/test?msg=testing"
					}
					
					stage('Nexus Upload'){
						nexusArtifactUploader(
						nexusVersion: 'nexus3',
						protocol: 'http',
						nexusUrl: 'http://localhost:8081/',
						groupId: 'com.devopsusach2020',
						version: '0.0.1',
						repository: 'test-nexus',
						credentialsId: 'nexus',
						artifacts: [
						[artifactId: 'DevOpsUsach2020',
						classifier: '',
						file: 'C:/Users/luisv/OneDrive/Taller11/ejemplo-gradle/build/DevOpsUsach2020-0.0.1.jar',
						type: 'jar']
						]
						)
					}
					
				}
			}
			
		}
}
}