package introduccion.project.reactor;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Ejemplo04 {
	public static void main(String[] args) {
		//Un suplier te devuelve un valor sin pasar alguna parametro
		//El mono esta emitiendo un excepcion
		Flux<String> flux=Flux.fromArray(new String[] {"data1","data2","data3"});
		flux.subscribe(System.out::println);
		flux.doOnNext(System.out::println).subscribe();
	}
}
