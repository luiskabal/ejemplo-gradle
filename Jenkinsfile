pipeline{
	agent any
	parameters{choice(name: 'buildtool', choices:['gradle','maven'], description:'Parametros de herramientas a elegir')}
	stages{
		stage('Pipeline'){
			steps{
				script{
				def pipe=load"${params.buildtool}.groovy"
				pipe.call()	
				}
			}
			
		}
}
}