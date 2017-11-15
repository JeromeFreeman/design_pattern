package structural_pattern.decorator;

/**
 * @Author:F.jq
 * @Date:Created in 2017/11/14.
 * @description _
 * <P>抽象构件(Component)角色：给出一个抽象接口，以规范准备接收附加责任的对象。</P>
 *
 * <p>
 *  #动态地给一个对象添加一些额外的职责。就增加功能来说， Decorator模式相比生成子类更为灵活。该模式以对客 户端透明的方式扩展对象的功能。
 *  #要点：
 *   1、继承属于扩展形式之一，但不见得是达到弹性设计的最佳方案。
 *   2、在我们的设计中，应该允许行为可以被扩展，而不须修改现有的代码。
 *   3、组合和委托可用于在运行时动态地加上新的行为。
 *   4、除了继承，装饰者模式也可以让我们扩展行为。
 *   5、装饰者模式意味着一群装饰者类， 这些类用来包装具体组件。
 *   6、装饰者类反映出被装饰的组件类型（实际上，他们具有相同的类型，都经过接口或继承实现）。
 *   7、装饰者可以在被装饰者的行为前面与/或后面加上自己的行为，甚至将被装饰者的行为整个取代掉，而达到特定的目的。
 *   8、你可以有无数个装饰者包装一个组件。
 *   9、装饰者一般对组建的客户是透明的，除非客户程序依赖于组件的具体类型。
 * </p>
 */
public interface Component {

    public void sampleOperation();

}
