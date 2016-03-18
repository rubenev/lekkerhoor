/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import container.IContainer;
import java.util.List;
import javafx.geometry.Dimension2D;
import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import truck.ITruck;

/**
 *
 * @author mac_f
 */
public class IkeaFactory implements IFactory {
    private Point2D point2D;
    private Dimension2D dimension2D;
    private Point2D point2D0;
    private Point2D point2D1;
    private Image ikea;
    private Image productContainer;
    private Image productBox;
    private Image volvo; 
    public IkeaFactory(Point2D point2D, Dimension2D dimension2D, Point2D point2D0, Point2D point2D1, Image ikea, Image productContainer, Image productBox, Image volvo) {
        this.point2D = point2D;
        this.dimension2D = dimension2D;
        this.point2D0 = point2D0;
        this.point2D1 = point2D1;
        this.ikea = ikea;
        this.productBox = productBox;
        this.volvo = volvo;
    }
        
    @Override
    public ITruck getReadyTruck() {
        return null;
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Point2D getPosition() {
        return null;
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<IContainer> getProductsToShip() {
        return null;
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(float dt) {
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void draw(GraphicsContext gc) {
         gc.drawImage(this.ikea,this.point2D.getX(),this.point2D.getY(),this.dimension2D.getWidth(),this.dimension2D.getHeight());//To change body of generated methods, choose Tools | Templates.
    }
    
}
