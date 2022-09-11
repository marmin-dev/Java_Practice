package sec02.example04;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class PoupulationEx {

	public static ArrayList<Population> popul = new ArrayList<>();
	
	public static void main(String[] args) {
		
		//Population객체 추가
		popul.add(new Population("덕적", 156000));
		popul.add(new Population("울릉", 245000));
		popul.add(new Population("포항", 331000));
		popul.add(new Population("울산", 423000));
		//지역이름 불러오기 및 출력 메서드 실행
		Function<Population,String> function =  t->{
			return t.getRegion();
		};	
		regionPrint(function);
		
		//지역인구 불러오기 및 출력메서드 실행
		ToDoubleFunction<Population> toDoubleFunction = a->{
			return a.getPopulation();
		};
		avgPrint(toDoubleFunction);
		
	}
	
	//지역을 출력
	public static void regionPrint(Function<Population, String> function) {
		for(Population population: popul) {
		String region = function.apply(population);
		System.out.print("지역 : " + region + "  ");
		}
		System.out.println();
	}
	
	//지역별 인구수와 평균값 출력
	public static void avgPrint(ToDoubleFunction<Population> toDoubleFunction) {
		double sum = 0.0;
		for(Population population: popul) {
			double value = toDoubleFunction.applyAsDouble(population);
			System.out.print("인구수 : " + value + "  ");
			sum += value;
		}
		
		System.out.println(sum/popul.size());
		
	};
}
