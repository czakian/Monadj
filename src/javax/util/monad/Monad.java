package javax.util.monad;

import java.util.function.Function;
import javax.util.functor.Functor;

public interface Monad<T> extends Functor<T> {
  public T unit();
  public <U> Monad<U> bind(Function<? super T, Monad<U>> f);
}
