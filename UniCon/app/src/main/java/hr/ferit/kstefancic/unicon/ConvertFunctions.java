package hr.ferit.kstefancic.unicon;

/**
 * Created by Kristijan on 3.4.2017..
 */

public class ConvertFunctions {
    public static float m_to_ly(float value) {
        return (float) (value*1.05702341*Math.pow(10,-16));
    }
    public static float m_to_in(float value) {
        return (float) (value*39.3700787);
    }
    public static float m_to_foot(float value) {
        return (float) (value*3.2808399);
    }
    public static float m_to_mile(float value) {
        return (float) (value*0.000621371192);
    }
    public static float m_to_y(float value) {
        return (float) (value* 1.0936133);
    }
    public static float m_to_nm(float value) {
        return (value*1000000000);
    }
    public static float m_to_microm(float value) {
        return (value*1000000);
    }
    public static float m_to_mm(float value) {
        return (value*1000);
    }
    public static float m_to_cm(float value) {
        return (value*100);
    }
    public static float m_to_km(float value) {
        return (float) (value*0.001);
    }
    public static float ly_to_m(float value) {
        return (float) (value*9.4605284*Math.pow(10,15));
    }
    public static float in_to_m(float value) {
        return (float) (value*0.0254);
    }
    public static float foot_to_m(float value) {
        return (float) (value*0.3048);
    }
    public static float mile_to_m(float value) {
        return (float) (value*1609.344);
    }
    public static float y_to_m(float value) {
        return (float) (value*(0.9144));
    }
    public static float nm_to_m(float value) {
        return (float) (value*0.000000001);
    }
    public static float microm_to_m(float value) {
        return (float) (value*0.000001);
    }
    public static float mm_to_m(float value) {
        return (float) (value*0.001);
    }
    public static float cm_to_m(float value) {
        return (float) (value*0.01);
    }
    public static float km_to_m(float value) {
        return (value*1000);
    }
    public static float g_to_kg(float value){
        return (float) (value*0.001);
    }
    public static float mg_to_kg(float value){
        return (float) (value*0.000001);
    }
    public static float t_to_kg(float value){
        return value*1000;
    }
    public static float pound_to_kg(float value){
        return (float) (value*0.45359237);
    }
    public static float ounce_to_kg(float value){
        return (float) (value*0.0283495231);
    }
    public static float carat_to_kg(float value){
        return (float) (value*0.0002);
    }
    public static float kg_to_carat(float value){
        return value*5000;
    }
    public static float kg_to_ounce(float value){
        return (float) (value*35.2739619);
    }
    public static float kg_to_pound(float value){
        return (float) (value*2.20462262);
    }
    public static float kg_to_t(float value){
        return (float) (value*0.001);
    }
    public static float kg_to_mg(float value){
        return (value*1000000);
    }
    public static float kg_to_g(float value){
        return value*1000;
    }
    public static float ckm_to_cm(float value){
        return value*1000000000;
    }
    public static float ccm_to_cm(float value){
        return (float) (value*0.000001);
    }
    public static float cmm_to_cm(float value){
        return (float) (value*Math.pow(10,-9));
    }
    public static float cmile_to_cm(float value){
        return (float) (value*4.16818183*Math.pow(10,9));
    }
    public static float cyard_to_cm(float value){
        return (float) (value*0.764554858);
    }
    public static float cfoot_to_cm(float value){
        return (float) (value*0.0283168466);
    }
    public static float cin_to_cm(float value){
        return (float) (value*1.6387064*Math.pow(10,-5));
    }
    public static float l_to_cm(float value){
        return (float) (value*0.001);
    }
    public static float ml_to_cm(float value){
        return (float) (value*Math.pow(10,-6));
    }
    public static float USgallon_to_cm(float value){
        return (float) (value*0.00378541178);
    }
    public static float USpint_to_cm(float value){
        return (float) (value*0.000473176473);
    }
    public static float USfluidounce_to_cm(float value){
        return (float) (value*2.95735296*Math.pow(10,-5));
    }
    public static float IMgallon_to_cm(float value){
        return (float) (value*0.00454609188);
    }
    public static float IMpint_to_cm(float value){
        return (float) (value*0.000568261485);
    }
    public static float IMfluidounce_to_cm(float value){
        return (float) (value*2.84130742*Math.pow(10,-5));
    }
    public static float cm_to_ckm(float value){
        return (float) (value*Math.pow(10,-9));
    }
    public static float cm_to_ccm(float value){
        return 1000000*value;
    }
    public static float cm_to_cmm(float value){
        return 1000000000*value;
    }
    public static float cm_to_cmile(float value){
        return (float) (value*2.39912759*Math.pow(10,-10));
    }
    public static float cm_to_cyard(float value){
        return (float) (value*1.30795062);
    }
    public static float cm_to_cfoot(float value){
        return (float) (value*35.3146667);
    }
    public static float cm_to_cinch(float value){
        return (float) (value*61023.7441);
    }
    public static float cm_to_l(float value){
        return value*1000;
    }
    public static float cm_to_ml(float value){
        return 1000000*value;
    }
    public static float cm_to_USgallon(float value){
        return (float) (value*264.172052);
    }
    public static float cm_to_USpint(float value){
        return (float) (value*2113.37642);
    }
    public static float cm_to_USfluidounce(float value){
        return (float) (value*33814.0227);
    }
    public static float cm_to_IMgallon(float value){
        return (float) (value*219.969157);
    }
    public static float cm_to_IMpint(float value){
        return (float) (value*1759.75326);
    } public static float cm_to_IMfluidounce(float value){
        return (float) (value*35195.0652);
    }
    public static float K_to_C(float value){
        return (float) (value-273.15);
    }
    public static float F_to_C(float value){
        return (float) ((value-32)/1.8);
    }
    public static float C_to_K(float value){
        return (float) (value+273.15);
    }
    public static float C_to_F(float value){
        return (float) ((value*1.8)+32);
    }
}
