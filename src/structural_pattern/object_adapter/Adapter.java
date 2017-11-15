package structural_pattern.object_adapter;

/**
 * @Author:F.jq
 * @Date:Created in 2017/11/14.
 * @description _
 * <p>对象的适配器模式</p>
 * <P>
 *     与类的适配器模式一样，对象的适配器模式把被适配的类的API转换成为目标类的API，
 *     与类的适配器模式不同的是，对象的适配器模式不是使用继承关系连接到Adaptee类，而是使用委派关系连接到Adaptee类。
 * </P>
 * <p>
 *     类适配器和对象适配器的权衡
 *     1、类适配器使用对象继承的方式，是静态的定义方式；而对象适配器使用对象组合的方式，是动态组合的方式。
 *     2、对于类适配器，由于适配器直接继承了Adaptee，使得适配器不能和Adaptee的子类一起工作，因为继承是静态的关系，当适配器继承了Adaptee后，就不可能再去处理  Adaptee的子类了。
 *        对于对象适配器，一个适配器可以把多种不同的源适配到同一个目标。换言之，同一个适配器可以把源类和它的子类都适配到目标接口。因为对象适配器采用的是对象组合的关系，只要对象类型正确，是不是子类都无所谓。
 *     3、对于类适配器，适配器可以重定义Adaptee的部分行为，相当于子类覆盖父类的部分实现方法。
 *        对于对象适配器，要重定义Adaptee的行为比较困难，这种情况下，需要定义Adaptee的子类来实现重定义，然后让适配器组合子类。虽然重定义Adaptee的行为比较困难，但是想要增加一些新的行为则方便的很，而且新增加的行为可同时适用于所有的源。
 *     4、对于类适配器，仅仅引入了一个对象，并不需要额外的引用来间接得到Adaptee。
 *        对于对象适配器，需要额外的引用来间接得到Adaptee。
 *     建议尽量使用对象适配器的实现方式，多用合成/聚合、少用继承。当然，具体问题具体分析，根据需要来选用实现方式，最适合的才是最好的。
 * </p>
 * <p>
 *     适配器模式的优点:
 *     1、更好的复用性
 *     2、系统需要使用现有的类，而此类的接口不符合系统的需要。那么通过适配器模式就可以让这些功能得到更好的复用。
 *     3、更好的扩展性
 *     4、在实现适配器功能的时候，可以调用自己开发的功能，从而自然地扩展系统的功能。
 *     适配器模式的缺点:
 *　   1、过多的使用适配器，会让系统非常零乱，不易整体进行把握。比如，明明看到调用的是A接口，其实内部被适配成了B接口的实现，一个系统如果太多出现这种情况，无异于一场灾难。
 *         因此如果不是很有必要，可以不使用适配器，而是直接对系统进行重构。
 * </p>
 */
public class Adapter {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    /**
     * 源类Adaptee有sampleOperation1方法，因此适配器直接委派即可
     */
    public void sampleOperation1(){
        this.adaptee.sampleOperation1();
    }

    /**
     * 源类Adaptee没有的方法sampleOperation2因此由适配器类需要补充此方法
     */
    public void sampleOperation2(){
        //相关代码
    }
}