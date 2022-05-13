package domain

import domain.Boletim 
import domain.BoletimFechado 
import domain.criterios.Basico 
import domain.criterios.CriterioDeAprovacao 
import domain.criterios.Intermediario 
import domain.criterios.Rigoroso 

class AnalisadorDeAprovacao {
    
        private var lateinit criterioEscolhido: CriterioDeAprovacao

        fun defineCriterio(criterio: CriterioDeAprovacao){
                criterioEscolhido = criterio
        }

        fun fechaBoletim(boletim: Boletim): BoletimFechado{
                boletimFinal = BoletimFechado(Boletim.mediaEPS, 
                                              Boletim.mediaMiniEPS,
                                              criterioEscolhido.mediaFinal(Boletim),
                                              criterioEscolhido.estaAprovado(Boletim))
 
                return boletimFinal
        }

}
