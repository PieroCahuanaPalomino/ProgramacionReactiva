package introduccion.project.reactor;

import java.util.ArrayList;
import java.util.List;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Ejemplo01 {
	public static void main(String[] args) {
		System.out.println("Hola mundo");
		List<Integer> elementosFromMono= new ArrayList<>();
		List<Integer> elementosFromFlux= new ArrayList<>();
		
		//Mono emite de 0 a 1 elemento
		Mono<Integer> mono= Mono.just(123);

		//Flux emite de 0 a varios elementos
		Flux<Integer> flux= Flux.just(14,12,13,15,10,1,12,3);
		
		//Nos suscribimos
		mono.subscribe(elementosFromMono::add);
		
		//Nos suscribimos al Flux
		flux.subscribe(elementosFromFlux::add);
		
		System.out.println(elementosFromMono);
		System.out.println(elementosFromFlux);
		
	}
}
