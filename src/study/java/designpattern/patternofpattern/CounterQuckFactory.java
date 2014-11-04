package study.java.designpattern.patternofpattern;

public class CounterQuckFactory extends AbstraDuckFactory {

	@Override
	public Quackable createDuck() {
		// TODO Auto-generated method stub
		return new QuackCounter(new GooseAdapter(new Goose()));
	}

}
