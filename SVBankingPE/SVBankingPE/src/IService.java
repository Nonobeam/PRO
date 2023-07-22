/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.time.LocalDate;
/**
 *
 * @author USER
 */
public interface IService {
    LocalDate today = LocalDate.now();
    
    public double checkBalance();
}
