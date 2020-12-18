pipeline{
	agent any
	parameters{choice(name: 'buildtool', choices:['gradle','maven'], description:'Parametros de herramientas a elegir')}
	stages{
			stage('Pipeline'){
				steps{
				echo 'aca'
					script{
					def pipe=load"${params.buildtool}.groovy"
					pipe.call()	
					}
				}
				
			}
	}

   post {
        always {
           slackSend channel: 'U01DK543PKN', color: 'good', message: "Ejecucion exitosa", teamDomain: 'devopsusach2020', tokenCredentialId: 'slack-Token'
        }
        failure {
			slackSend channel: 'U01DK543PKN', color: 'danger', message: "['Luis Varas Q'][${JOB_NAME}][params.buildtool]Ejecucion fallida", teamDomain: 'devopsusach2020', tokenCredentialId: 'slack-Token'
        }
    }
}

