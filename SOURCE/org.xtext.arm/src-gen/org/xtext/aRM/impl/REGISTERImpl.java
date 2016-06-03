/**
 */
package org.xtext.aRM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.aRM.ARMPackage;
import org.xtext.aRM.REGISTER;
import org.xtext.aRM.immediate_label;
import org.xtext.aRM.opsh;
import org.xtext.aRM.rs_sh;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>REGISTER</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#getImmediate_label <em>Immediate label</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#isR0 <em>R0</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#isR1 <em>R1</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#isR2 <em>R2</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#isR3 <em>R3</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#isR4 <em>R4</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#isR5 <em>R5</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#isR6 <em>R6</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#isR7 <em>R7</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#isR8 <em>R8</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#isR9 <em>R9</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#isR10 <em>R10</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#isR11 <em>R11</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#isR12 <em>R12</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#isR13 <em>R13</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#isR14 <em>R14</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#isR15 <em>R15</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#isRfp <em>Rfp</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#isRip <em>Rip</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#isRsp <em>Rsp</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#isRlr <em>Rlr</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#isRpc <em>Rpc</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#isR001 <em>R001</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#isR01 <em>R01</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#isR02 <em>R02</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#isR03 <em>R03</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#isR04 <em>R04</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#isR05 <em>R05</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#isR06 <em>R06</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#isR07 <em>R07</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#isR08 <em>R08</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#isR09 <em>R09</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#isR010 <em>R010</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#isR011 <em>R011</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#isR012 <em>R012</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#isR013 <em>R013</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#isR014 <em>R014</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#isR015 <em>R015</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#isR0FP <em>R0FP</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#isR0IP <em>R0IP</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#isR0SP <em>R0SP</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#isR0LR <em>R0LR</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#isR0PC <em>R0PC</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.REGISTERImpl#getOpsh <em>Opsh</em>}</li>
 * </ul>
 *
 * @generated
 */
public class REGISTERImpl extends Operand2Impl implements REGISTER
{
  /**
   * The cached value of the '{@link #getImmediate_label() <em>Immediate label</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImmediate_label()
   * @generated
   * @ordered
   */
  protected EList<immediate_label> immediate_label;

  /**
   * The default value of the '{@link #isR0() <em>R0</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR0()
   * @generated
   * @ordered
   */
  protected static final boolean R0_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isR0() <em>R0</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR0()
   * @generated
   * @ordered
   */
  protected boolean r0 = R0_EDEFAULT;

  /**
   * The default value of the '{@link #isR1() <em>R1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR1()
   * @generated
   * @ordered
   */
  protected static final boolean R1_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isR1() <em>R1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR1()
   * @generated
   * @ordered
   */
  protected boolean r1 = R1_EDEFAULT;

  /**
   * The default value of the '{@link #isR2() <em>R2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR2()
   * @generated
   * @ordered
   */
  protected static final boolean R2_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isR2() <em>R2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR2()
   * @generated
   * @ordered
   */
  protected boolean r2 = R2_EDEFAULT;

  /**
   * The default value of the '{@link #isR3() <em>R3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR3()
   * @generated
   * @ordered
   */
  protected static final boolean R3_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isR3() <em>R3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR3()
   * @generated
   * @ordered
   */
  protected boolean r3 = R3_EDEFAULT;

  /**
   * The default value of the '{@link #isR4() <em>R4</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR4()
   * @generated
   * @ordered
   */
  protected static final boolean R4_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isR4() <em>R4</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR4()
   * @generated
   * @ordered
   */
  protected boolean r4 = R4_EDEFAULT;

  /**
   * The default value of the '{@link #isR5() <em>R5</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR5()
   * @generated
   * @ordered
   */
  protected static final boolean R5_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isR5() <em>R5</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR5()
   * @generated
   * @ordered
   */
  protected boolean r5 = R5_EDEFAULT;

  /**
   * The default value of the '{@link #isR6() <em>R6</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR6()
   * @generated
   * @ordered
   */
  protected static final boolean R6_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isR6() <em>R6</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR6()
   * @generated
   * @ordered
   */
  protected boolean r6 = R6_EDEFAULT;

  /**
   * The default value of the '{@link #isR7() <em>R7</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR7()
   * @generated
   * @ordered
   */
  protected static final boolean R7_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isR7() <em>R7</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR7()
   * @generated
   * @ordered
   */
  protected boolean r7 = R7_EDEFAULT;

  /**
   * The default value of the '{@link #isR8() <em>R8</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR8()
   * @generated
   * @ordered
   */
  protected static final boolean R8_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isR8() <em>R8</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR8()
   * @generated
   * @ordered
   */
  protected boolean r8 = R8_EDEFAULT;

  /**
   * The default value of the '{@link #isR9() <em>R9</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR9()
   * @generated
   * @ordered
   */
  protected static final boolean R9_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isR9() <em>R9</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR9()
   * @generated
   * @ordered
   */
  protected boolean r9 = R9_EDEFAULT;

  /**
   * The default value of the '{@link #isR10() <em>R10</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR10()
   * @generated
   * @ordered
   */
  protected static final boolean R10_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isR10() <em>R10</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR10()
   * @generated
   * @ordered
   */
  protected boolean r10 = R10_EDEFAULT;

  /**
   * The default value of the '{@link #isR11() <em>R11</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR11()
   * @generated
   * @ordered
   */
  protected static final boolean R11_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isR11() <em>R11</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR11()
   * @generated
   * @ordered
   */
  protected boolean r11 = R11_EDEFAULT;

  /**
   * The default value of the '{@link #isR12() <em>R12</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR12()
   * @generated
   * @ordered
   */
  protected static final boolean R12_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isR12() <em>R12</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR12()
   * @generated
   * @ordered
   */
  protected boolean r12 = R12_EDEFAULT;

  /**
   * The default value of the '{@link #isR13() <em>R13</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR13()
   * @generated
   * @ordered
   */
  protected static final boolean R13_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isR13() <em>R13</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR13()
   * @generated
   * @ordered
   */
  protected boolean r13 = R13_EDEFAULT;

  /**
   * The default value of the '{@link #isR14() <em>R14</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR14()
   * @generated
   * @ordered
   */
  protected static final boolean R14_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isR14() <em>R14</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR14()
   * @generated
   * @ordered
   */
  protected boolean r14 = R14_EDEFAULT;

  /**
   * The default value of the '{@link #isR15() <em>R15</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR15()
   * @generated
   * @ordered
   */
  protected static final boolean R15_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isR15() <em>R15</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR15()
   * @generated
   * @ordered
   */
  protected boolean r15 = R15_EDEFAULT;

  /**
   * The default value of the '{@link #isRfp() <em>Rfp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRfp()
   * @generated
   * @ordered
   */
  protected static final boolean RFP_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRfp() <em>Rfp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRfp()
   * @generated
   * @ordered
   */
  protected boolean rfp = RFP_EDEFAULT;

  /**
   * The default value of the '{@link #isRip() <em>Rip</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRip()
   * @generated
   * @ordered
   */
  protected static final boolean RIP_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRip() <em>Rip</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRip()
   * @generated
   * @ordered
   */
  protected boolean rip = RIP_EDEFAULT;

  /**
   * The default value of the '{@link #isRsp() <em>Rsp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRsp()
   * @generated
   * @ordered
   */
  protected static final boolean RSP_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRsp() <em>Rsp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRsp()
   * @generated
   * @ordered
   */
  protected boolean rsp = RSP_EDEFAULT;

  /**
   * The default value of the '{@link #isRlr() <em>Rlr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRlr()
   * @generated
   * @ordered
   */
  protected static final boolean RLR_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRlr() <em>Rlr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRlr()
   * @generated
   * @ordered
   */
  protected boolean rlr = RLR_EDEFAULT;

  /**
   * The default value of the '{@link #isRpc() <em>Rpc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRpc()
   * @generated
   * @ordered
   */
  protected static final boolean RPC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRpc() <em>Rpc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRpc()
   * @generated
   * @ordered
   */
  protected boolean rpc = RPC_EDEFAULT;

  /**
   * The default value of the '{@link #isR001() <em>R001</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR001()
   * @generated
   * @ordered
   */
  protected static final boolean R001_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isR001() <em>R001</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR001()
   * @generated
   * @ordered
   */
  protected boolean r001 = R001_EDEFAULT;

  /**
   * The default value of the '{@link #isR01() <em>R01</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR01()
   * @generated
   * @ordered
   */
  protected static final boolean R01_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isR01() <em>R01</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR01()
   * @generated
   * @ordered
   */
  protected boolean r01 = R01_EDEFAULT;

  /**
   * The default value of the '{@link #isR02() <em>R02</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR02()
   * @generated
   * @ordered
   */
  protected static final boolean R02_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isR02() <em>R02</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR02()
   * @generated
   * @ordered
   */
  protected boolean r02 = R02_EDEFAULT;

  /**
   * The default value of the '{@link #isR03() <em>R03</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR03()
   * @generated
   * @ordered
   */
  protected static final boolean R03_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isR03() <em>R03</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR03()
   * @generated
   * @ordered
   */
  protected boolean r03 = R03_EDEFAULT;

  /**
   * The default value of the '{@link #isR04() <em>R04</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR04()
   * @generated
   * @ordered
   */
  protected static final boolean R04_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isR04() <em>R04</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR04()
   * @generated
   * @ordered
   */
  protected boolean r04 = R04_EDEFAULT;

  /**
   * The default value of the '{@link #isR05() <em>R05</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR05()
   * @generated
   * @ordered
   */
  protected static final boolean R05_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isR05() <em>R05</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR05()
   * @generated
   * @ordered
   */
  protected boolean r05 = R05_EDEFAULT;

  /**
   * The default value of the '{@link #isR06() <em>R06</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR06()
   * @generated
   * @ordered
   */
  protected static final boolean R06_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isR06() <em>R06</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR06()
   * @generated
   * @ordered
   */
  protected boolean r06 = R06_EDEFAULT;

  /**
   * The default value of the '{@link #isR07() <em>R07</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR07()
   * @generated
   * @ordered
   */
  protected static final boolean R07_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isR07() <em>R07</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR07()
   * @generated
   * @ordered
   */
  protected boolean r07 = R07_EDEFAULT;

  /**
   * The default value of the '{@link #isR08() <em>R08</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR08()
   * @generated
   * @ordered
   */
  protected static final boolean R08_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isR08() <em>R08</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR08()
   * @generated
   * @ordered
   */
  protected boolean r08 = R08_EDEFAULT;

  /**
   * The default value of the '{@link #isR09() <em>R09</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR09()
   * @generated
   * @ordered
   */
  protected static final boolean R09_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isR09() <em>R09</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR09()
   * @generated
   * @ordered
   */
  protected boolean r09 = R09_EDEFAULT;

  /**
   * The default value of the '{@link #isR010() <em>R010</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR010()
   * @generated
   * @ordered
   */
  protected static final boolean R010_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isR010() <em>R010</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR010()
   * @generated
   * @ordered
   */
  protected boolean r010 = R010_EDEFAULT;

  /**
   * The default value of the '{@link #isR011() <em>R011</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR011()
   * @generated
   * @ordered
   */
  protected static final boolean R011_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isR011() <em>R011</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR011()
   * @generated
   * @ordered
   */
  protected boolean r011 = R011_EDEFAULT;

  /**
   * The default value of the '{@link #isR012() <em>R012</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR012()
   * @generated
   * @ordered
   */
  protected static final boolean R012_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isR012() <em>R012</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR012()
   * @generated
   * @ordered
   */
  protected boolean r012 = R012_EDEFAULT;

  /**
   * The default value of the '{@link #isR013() <em>R013</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR013()
   * @generated
   * @ordered
   */
  protected static final boolean R013_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isR013() <em>R013</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR013()
   * @generated
   * @ordered
   */
  protected boolean r013 = R013_EDEFAULT;

  /**
   * The default value of the '{@link #isR014() <em>R014</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR014()
   * @generated
   * @ordered
   */
  protected static final boolean R014_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isR014() <em>R014</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR014()
   * @generated
   * @ordered
   */
  protected boolean r014 = R014_EDEFAULT;

  /**
   * The default value of the '{@link #isR015() <em>R015</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR015()
   * @generated
   * @ordered
   */
  protected static final boolean R015_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isR015() <em>R015</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR015()
   * @generated
   * @ordered
   */
  protected boolean r015 = R015_EDEFAULT;

  /**
   * The default value of the '{@link #isR0FP() <em>R0FP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR0FP()
   * @generated
   * @ordered
   */
  protected static final boolean R0FP_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isR0FP() <em>R0FP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR0FP()
   * @generated
   * @ordered
   */
  protected boolean r0FP = R0FP_EDEFAULT;

  /**
   * The default value of the '{@link #isR0IP() <em>R0IP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR0IP()
   * @generated
   * @ordered
   */
  protected static final boolean R0IP_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isR0IP() <em>R0IP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR0IP()
   * @generated
   * @ordered
   */
  protected boolean r0IP = R0IP_EDEFAULT;

  /**
   * The default value of the '{@link #isR0SP() <em>R0SP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR0SP()
   * @generated
   * @ordered
   */
  protected static final boolean R0SP_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isR0SP() <em>R0SP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR0SP()
   * @generated
   * @ordered
   */
  protected boolean r0SP = R0SP_EDEFAULT;

  /**
   * The default value of the '{@link #isR0LR() <em>R0LR</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR0LR()
   * @generated
   * @ordered
   */
  protected static final boolean R0LR_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isR0LR() <em>R0LR</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR0LR()
   * @generated
   * @ordered
   */
  protected boolean r0LR = R0LR_EDEFAULT;

  /**
   * The default value of the '{@link #isR0PC() <em>R0PC</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR0PC()
   * @generated
   * @ordered
   */
  protected static final boolean R0PC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isR0PC() <em>R0PC</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isR0PC()
   * @generated
   * @ordered
   */
  protected boolean r0PC = R0PC_EDEFAULT;

  /**
   * The cached value of the '{@link #getOpsh() <em>Opsh</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpsh()
   * @generated
   * @ordered
   */
  protected EList<opsh> opsh;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected REGISTERImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ARMPackage.Literals.REGISTER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<immediate_label> getImmediate_label()
  {
    if (immediate_label == null)
    {
      immediate_label = new EObjectContainmentEList<immediate_label>(immediate_label.class, this, ARMPackage.REGISTER__IMMEDIATE_LABEL);
    }
    return immediate_label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isR0()
  {
    return r0;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR0(boolean newR0)
  {
    boolean oldR0 = r0;
    r0 = newR0;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.REGISTER__R0, oldR0, r0));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isR1()
  {
    return r1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR1(boolean newR1)
  {
    boolean oldR1 = r1;
    r1 = newR1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.REGISTER__R1, oldR1, r1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isR2()
  {
    return r2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR2(boolean newR2)
  {
    boolean oldR2 = r2;
    r2 = newR2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.REGISTER__R2, oldR2, r2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isR3()
  {
    return r3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR3(boolean newR3)
  {
    boolean oldR3 = r3;
    r3 = newR3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.REGISTER__R3, oldR3, r3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isR4()
  {
    return r4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR4(boolean newR4)
  {
    boolean oldR4 = r4;
    r4 = newR4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.REGISTER__R4, oldR4, r4));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isR5()
  {
    return r5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR5(boolean newR5)
  {
    boolean oldR5 = r5;
    r5 = newR5;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.REGISTER__R5, oldR5, r5));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isR6()
  {
    return r6;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR6(boolean newR6)
  {
    boolean oldR6 = r6;
    r6 = newR6;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.REGISTER__R6, oldR6, r6));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isR7()
  {
    return r7;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR7(boolean newR7)
  {
    boolean oldR7 = r7;
    r7 = newR7;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.REGISTER__R7, oldR7, r7));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isR8()
  {
    return r8;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR8(boolean newR8)
  {
    boolean oldR8 = r8;
    r8 = newR8;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.REGISTER__R8, oldR8, r8));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isR9()
  {
    return r9;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR9(boolean newR9)
  {
    boolean oldR9 = r9;
    r9 = newR9;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.REGISTER__R9, oldR9, r9));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isR10()
  {
    return r10;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR10(boolean newR10)
  {
    boolean oldR10 = r10;
    r10 = newR10;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.REGISTER__R10, oldR10, r10));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isR11()
  {
    return r11;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR11(boolean newR11)
  {
    boolean oldR11 = r11;
    r11 = newR11;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.REGISTER__R11, oldR11, r11));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isR12()
  {
    return r12;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR12(boolean newR12)
  {
    boolean oldR12 = r12;
    r12 = newR12;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.REGISTER__R12, oldR12, r12));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isR13()
  {
    return r13;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR13(boolean newR13)
  {
    boolean oldR13 = r13;
    r13 = newR13;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.REGISTER__R13, oldR13, r13));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isR14()
  {
    return r14;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR14(boolean newR14)
  {
    boolean oldR14 = r14;
    r14 = newR14;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.REGISTER__R14, oldR14, r14));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isR15()
  {
    return r15;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR15(boolean newR15)
  {
    boolean oldR15 = r15;
    r15 = newR15;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.REGISTER__R15, oldR15, r15));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRfp()
  {
    return rfp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRfp(boolean newRfp)
  {
    boolean oldRfp = rfp;
    rfp = newRfp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.REGISTER__RFP, oldRfp, rfp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRip()
  {
    return rip;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRip(boolean newRip)
  {
    boolean oldRip = rip;
    rip = newRip;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.REGISTER__RIP, oldRip, rip));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRsp()
  {
    return rsp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRsp(boolean newRsp)
  {
    boolean oldRsp = rsp;
    rsp = newRsp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.REGISTER__RSP, oldRsp, rsp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRlr()
  {
    return rlr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRlr(boolean newRlr)
  {
    boolean oldRlr = rlr;
    rlr = newRlr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.REGISTER__RLR, oldRlr, rlr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRpc()
  {
    return rpc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRpc(boolean newRpc)
  {
    boolean oldRpc = rpc;
    rpc = newRpc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.REGISTER__RPC, oldRpc, rpc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isR001()
  {
    return r001;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR001(boolean newR001)
  {
    boolean oldR001 = r001;
    r001 = newR001;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.REGISTER__R001, oldR001, r001));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isR01()
  {
    return r01;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR01(boolean newR01)
  {
    boolean oldR01 = r01;
    r01 = newR01;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.REGISTER__R01, oldR01, r01));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isR02()
  {
    return r02;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR02(boolean newR02)
  {
    boolean oldR02 = r02;
    r02 = newR02;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.REGISTER__R02, oldR02, r02));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isR03()
  {
    return r03;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR03(boolean newR03)
  {
    boolean oldR03 = r03;
    r03 = newR03;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.REGISTER__R03, oldR03, r03));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isR04()
  {
    return r04;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR04(boolean newR04)
  {
    boolean oldR04 = r04;
    r04 = newR04;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.REGISTER__R04, oldR04, r04));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isR05()
  {
    return r05;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR05(boolean newR05)
  {
    boolean oldR05 = r05;
    r05 = newR05;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.REGISTER__R05, oldR05, r05));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isR06()
  {
    return r06;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR06(boolean newR06)
  {
    boolean oldR06 = r06;
    r06 = newR06;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.REGISTER__R06, oldR06, r06));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isR07()
  {
    return r07;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR07(boolean newR07)
  {
    boolean oldR07 = r07;
    r07 = newR07;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.REGISTER__R07, oldR07, r07));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isR08()
  {
    return r08;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR08(boolean newR08)
  {
    boolean oldR08 = r08;
    r08 = newR08;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.REGISTER__R08, oldR08, r08));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isR09()
  {
    return r09;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR09(boolean newR09)
  {
    boolean oldR09 = r09;
    r09 = newR09;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.REGISTER__R09, oldR09, r09));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isR010()
  {
    return r010;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR010(boolean newR010)
  {
    boolean oldR010 = r010;
    r010 = newR010;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.REGISTER__R010, oldR010, r010));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isR011()
  {
    return r011;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR011(boolean newR011)
  {
    boolean oldR011 = r011;
    r011 = newR011;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.REGISTER__R011, oldR011, r011));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isR012()
  {
    return r012;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR012(boolean newR012)
  {
    boolean oldR012 = r012;
    r012 = newR012;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.REGISTER__R012, oldR012, r012));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isR013()
  {
    return r013;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR013(boolean newR013)
  {
    boolean oldR013 = r013;
    r013 = newR013;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.REGISTER__R013, oldR013, r013));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isR014()
  {
    return r014;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR014(boolean newR014)
  {
    boolean oldR014 = r014;
    r014 = newR014;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.REGISTER__R014, oldR014, r014));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isR015()
  {
    return r015;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR015(boolean newR015)
  {
    boolean oldR015 = r015;
    r015 = newR015;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.REGISTER__R015, oldR015, r015));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isR0FP()
  {
    return r0FP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR0FP(boolean newR0FP)
  {
    boolean oldR0FP = r0FP;
    r0FP = newR0FP;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.REGISTER__R0FP, oldR0FP, r0FP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isR0IP()
  {
    return r0IP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR0IP(boolean newR0IP)
  {
    boolean oldR0IP = r0IP;
    r0IP = newR0IP;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.REGISTER__R0IP, oldR0IP, r0IP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isR0SP()
  {
    return r0SP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR0SP(boolean newR0SP)
  {
    boolean oldR0SP = r0SP;
    r0SP = newR0SP;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.REGISTER__R0SP, oldR0SP, r0SP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isR0LR()
  {
    return r0LR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR0LR(boolean newR0LR)
  {
    boolean oldR0LR = r0LR;
    r0LR = newR0LR;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.REGISTER__R0LR, oldR0LR, r0LR));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isR0PC()
  {
    return r0PC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR0PC(boolean newR0PC)
  {
    boolean oldR0PC = r0PC;
    r0PC = newR0PC;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.REGISTER__R0PC, oldR0PC, r0PC));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<opsh> getOpsh()
  {
    if (opsh == null)
    {
      opsh = new EObjectContainmentEList<opsh>(opsh.class, this, ARMPackage.REGISTER__OPSH);
    }
    return opsh;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ARMPackage.REGISTER__IMMEDIATE_LABEL:
        return ((InternalEList<?>)getImmediate_label()).basicRemove(otherEnd, msgs);
      case ARMPackage.REGISTER__OPSH:
        return ((InternalEList<?>)getOpsh()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ARMPackage.REGISTER__IMMEDIATE_LABEL:
        return getImmediate_label();
      case ARMPackage.REGISTER__R0:
        return isR0();
      case ARMPackage.REGISTER__R1:
        return isR1();
      case ARMPackage.REGISTER__R2:
        return isR2();
      case ARMPackage.REGISTER__R3:
        return isR3();
      case ARMPackage.REGISTER__R4:
        return isR4();
      case ARMPackage.REGISTER__R5:
        return isR5();
      case ARMPackage.REGISTER__R6:
        return isR6();
      case ARMPackage.REGISTER__R7:
        return isR7();
      case ARMPackage.REGISTER__R8:
        return isR8();
      case ARMPackage.REGISTER__R9:
        return isR9();
      case ARMPackage.REGISTER__R10:
        return isR10();
      case ARMPackage.REGISTER__R11:
        return isR11();
      case ARMPackage.REGISTER__R12:
        return isR12();
      case ARMPackage.REGISTER__R13:
        return isR13();
      case ARMPackage.REGISTER__R14:
        return isR14();
      case ARMPackage.REGISTER__R15:
        return isR15();
      case ARMPackage.REGISTER__RFP:
        return isRfp();
      case ARMPackage.REGISTER__RIP:
        return isRip();
      case ARMPackage.REGISTER__RSP:
        return isRsp();
      case ARMPackage.REGISTER__RLR:
        return isRlr();
      case ARMPackage.REGISTER__RPC:
        return isRpc();
      case ARMPackage.REGISTER__R001:
        return isR001();
      case ARMPackage.REGISTER__R01:
        return isR01();
      case ARMPackage.REGISTER__R02:
        return isR02();
      case ARMPackage.REGISTER__R03:
        return isR03();
      case ARMPackage.REGISTER__R04:
        return isR04();
      case ARMPackage.REGISTER__R05:
        return isR05();
      case ARMPackage.REGISTER__R06:
        return isR06();
      case ARMPackage.REGISTER__R07:
        return isR07();
      case ARMPackage.REGISTER__R08:
        return isR08();
      case ARMPackage.REGISTER__R09:
        return isR09();
      case ARMPackage.REGISTER__R010:
        return isR010();
      case ARMPackage.REGISTER__R011:
        return isR011();
      case ARMPackage.REGISTER__R012:
        return isR012();
      case ARMPackage.REGISTER__R013:
        return isR013();
      case ARMPackage.REGISTER__R014:
        return isR014();
      case ARMPackage.REGISTER__R015:
        return isR015();
      case ARMPackage.REGISTER__R0FP:
        return isR0FP();
      case ARMPackage.REGISTER__R0IP:
        return isR0IP();
      case ARMPackage.REGISTER__R0SP:
        return isR0SP();
      case ARMPackage.REGISTER__R0LR:
        return isR0LR();
      case ARMPackage.REGISTER__R0PC:
        return isR0PC();
      case ARMPackage.REGISTER__OPSH:
        return getOpsh();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ARMPackage.REGISTER__IMMEDIATE_LABEL:
        getImmediate_label().clear();
        getImmediate_label().addAll((Collection<? extends immediate_label>)newValue);
        return;
      case ARMPackage.REGISTER__R0:
        setR0((Boolean)newValue);
        return;
      case ARMPackage.REGISTER__R1:
        setR1((Boolean)newValue);
        return;
      case ARMPackage.REGISTER__R2:
        setR2((Boolean)newValue);
        return;
      case ARMPackage.REGISTER__R3:
        setR3((Boolean)newValue);
        return;
      case ARMPackage.REGISTER__R4:
        setR4((Boolean)newValue);
        return;
      case ARMPackage.REGISTER__R5:
        setR5((Boolean)newValue);
        return;
      case ARMPackage.REGISTER__R6:
        setR6((Boolean)newValue);
        return;
      case ARMPackage.REGISTER__R7:
        setR7((Boolean)newValue);
        return;
      case ARMPackage.REGISTER__R8:
        setR8((Boolean)newValue);
        return;
      case ARMPackage.REGISTER__R9:
        setR9((Boolean)newValue);
        return;
      case ARMPackage.REGISTER__R10:
        setR10((Boolean)newValue);
        return;
      case ARMPackage.REGISTER__R11:
        setR11((Boolean)newValue);
        return;
      case ARMPackage.REGISTER__R12:
        setR12((Boolean)newValue);
        return;
      case ARMPackage.REGISTER__R13:
        setR13((Boolean)newValue);
        return;
      case ARMPackage.REGISTER__R14:
        setR14((Boolean)newValue);
        return;
      case ARMPackage.REGISTER__R15:
        setR15((Boolean)newValue);
        return;
      case ARMPackage.REGISTER__RFP:
        setRfp((Boolean)newValue);
        return;
      case ARMPackage.REGISTER__RIP:
        setRip((Boolean)newValue);
        return;
      case ARMPackage.REGISTER__RSP:
        setRsp((Boolean)newValue);
        return;
      case ARMPackage.REGISTER__RLR:
        setRlr((Boolean)newValue);
        return;
      case ARMPackage.REGISTER__RPC:
        setRpc((Boolean)newValue);
        return;
      case ARMPackage.REGISTER__R001:
        setR001((Boolean)newValue);
        return;
      case ARMPackage.REGISTER__R01:
        setR01((Boolean)newValue);
        return;
      case ARMPackage.REGISTER__R02:
        setR02((Boolean)newValue);
        return;
      case ARMPackage.REGISTER__R03:
        setR03((Boolean)newValue);
        return;
      case ARMPackage.REGISTER__R04:
        setR04((Boolean)newValue);
        return;
      case ARMPackage.REGISTER__R05:
        setR05((Boolean)newValue);
        return;
      case ARMPackage.REGISTER__R06:
        setR06((Boolean)newValue);
        return;
      case ARMPackage.REGISTER__R07:
        setR07((Boolean)newValue);
        return;
      case ARMPackage.REGISTER__R08:
        setR08((Boolean)newValue);
        return;
      case ARMPackage.REGISTER__R09:
        setR09((Boolean)newValue);
        return;
      case ARMPackage.REGISTER__R010:
        setR010((Boolean)newValue);
        return;
      case ARMPackage.REGISTER__R011:
        setR011((Boolean)newValue);
        return;
      case ARMPackage.REGISTER__R012:
        setR012((Boolean)newValue);
        return;
      case ARMPackage.REGISTER__R013:
        setR013((Boolean)newValue);
        return;
      case ARMPackage.REGISTER__R014:
        setR014((Boolean)newValue);
        return;
      case ARMPackage.REGISTER__R015:
        setR015((Boolean)newValue);
        return;
      case ARMPackage.REGISTER__R0FP:
        setR0FP((Boolean)newValue);
        return;
      case ARMPackage.REGISTER__R0IP:
        setR0IP((Boolean)newValue);
        return;
      case ARMPackage.REGISTER__R0SP:
        setR0SP((Boolean)newValue);
        return;
      case ARMPackage.REGISTER__R0LR:
        setR0LR((Boolean)newValue);
        return;
      case ARMPackage.REGISTER__R0PC:
        setR0PC((Boolean)newValue);
        return;
      case ARMPackage.REGISTER__OPSH:
        getOpsh().clear();
        getOpsh().addAll((Collection<? extends opsh>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ARMPackage.REGISTER__IMMEDIATE_LABEL:
        getImmediate_label().clear();
        return;
      case ARMPackage.REGISTER__R0:
        setR0(R0_EDEFAULT);
        return;
      case ARMPackage.REGISTER__R1:
        setR1(R1_EDEFAULT);
        return;
      case ARMPackage.REGISTER__R2:
        setR2(R2_EDEFAULT);
        return;
      case ARMPackage.REGISTER__R3:
        setR3(R3_EDEFAULT);
        return;
      case ARMPackage.REGISTER__R4:
        setR4(R4_EDEFAULT);
        return;
      case ARMPackage.REGISTER__R5:
        setR5(R5_EDEFAULT);
        return;
      case ARMPackage.REGISTER__R6:
        setR6(R6_EDEFAULT);
        return;
      case ARMPackage.REGISTER__R7:
        setR7(R7_EDEFAULT);
        return;
      case ARMPackage.REGISTER__R8:
        setR8(R8_EDEFAULT);
        return;
      case ARMPackage.REGISTER__R9:
        setR9(R9_EDEFAULT);
        return;
      case ARMPackage.REGISTER__R10:
        setR10(R10_EDEFAULT);
        return;
      case ARMPackage.REGISTER__R11:
        setR11(R11_EDEFAULT);
        return;
      case ARMPackage.REGISTER__R12:
        setR12(R12_EDEFAULT);
        return;
      case ARMPackage.REGISTER__R13:
        setR13(R13_EDEFAULT);
        return;
      case ARMPackage.REGISTER__R14:
        setR14(R14_EDEFAULT);
        return;
      case ARMPackage.REGISTER__R15:
        setR15(R15_EDEFAULT);
        return;
      case ARMPackage.REGISTER__RFP:
        setRfp(RFP_EDEFAULT);
        return;
      case ARMPackage.REGISTER__RIP:
        setRip(RIP_EDEFAULT);
        return;
      case ARMPackage.REGISTER__RSP:
        setRsp(RSP_EDEFAULT);
        return;
      case ARMPackage.REGISTER__RLR:
        setRlr(RLR_EDEFAULT);
        return;
      case ARMPackage.REGISTER__RPC:
        setRpc(RPC_EDEFAULT);
        return;
      case ARMPackage.REGISTER__R001:
        setR001(R001_EDEFAULT);
        return;
      case ARMPackage.REGISTER__R01:
        setR01(R01_EDEFAULT);
        return;
      case ARMPackage.REGISTER__R02:
        setR02(R02_EDEFAULT);
        return;
      case ARMPackage.REGISTER__R03:
        setR03(R03_EDEFAULT);
        return;
      case ARMPackage.REGISTER__R04:
        setR04(R04_EDEFAULT);
        return;
      case ARMPackage.REGISTER__R05:
        setR05(R05_EDEFAULT);
        return;
      case ARMPackage.REGISTER__R06:
        setR06(R06_EDEFAULT);
        return;
      case ARMPackage.REGISTER__R07:
        setR07(R07_EDEFAULT);
        return;
      case ARMPackage.REGISTER__R08:
        setR08(R08_EDEFAULT);
        return;
      case ARMPackage.REGISTER__R09:
        setR09(R09_EDEFAULT);
        return;
      case ARMPackage.REGISTER__R010:
        setR010(R010_EDEFAULT);
        return;
      case ARMPackage.REGISTER__R011:
        setR011(R011_EDEFAULT);
        return;
      case ARMPackage.REGISTER__R012:
        setR012(R012_EDEFAULT);
        return;
      case ARMPackage.REGISTER__R013:
        setR013(R013_EDEFAULT);
        return;
      case ARMPackage.REGISTER__R014:
        setR014(R014_EDEFAULT);
        return;
      case ARMPackage.REGISTER__R015:
        setR015(R015_EDEFAULT);
        return;
      case ARMPackage.REGISTER__R0FP:
        setR0FP(R0FP_EDEFAULT);
        return;
      case ARMPackage.REGISTER__R0IP:
        setR0IP(R0IP_EDEFAULT);
        return;
      case ARMPackage.REGISTER__R0SP:
        setR0SP(R0SP_EDEFAULT);
        return;
      case ARMPackage.REGISTER__R0LR:
        setR0LR(R0LR_EDEFAULT);
        return;
      case ARMPackage.REGISTER__R0PC:
        setR0PC(R0PC_EDEFAULT);
        return;
      case ARMPackage.REGISTER__OPSH:
        getOpsh().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ARMPackage.REGISTER__IMMEDIATE_LABEL:
        return immediate_label != null && !immediate_label.isEmpty();
      case ARMPackage.REGISTER__R0:
        return r0 != R0_EDEFAULT;
      case ARMPackage.REGISTER__R1:
        return r1 != R1_EDEFAULT;
      case ARMPackage.REGISTER__R2:
        return r2 != R2_EDEFAULT;
      case ARMPackage.REGISTER__R3:
        return r3 != R3_EDEFAULT;
      case ARMPackage.REGISTER__R4:
        return r4 != R4_EDEFAULT;
      case ARMPackage.REGISTER__R5:
        return r5 != R5_EDEFAULT;
      case ARMPackage.REGISTER__R6:
        return r6 != R6_EDEFAULT;
      case ARMPackage.REGISTER__R7:
        return r7 != R7_EDEFAULT;
      case ARMPackage.REGISTER__R8:
        return r8 != R8_EDEFAULT;
      case ARMPackage.REGISTER__R9:
        return r9 != R9_EDEFAULT;
      case ARMPackage.REGISTER__R10:
        return r10 != R10_EDEFAULT;
      case ARMPackage.REGISTER__R11:
        return r11 != R11_EDEFAULT;
      case ARMPackage.REGISTER__R12:
        return r12 != R12_EDEFAULT;
      case ARMPackage.REGISTER__R13:
        return r13 != R13_EDEFAULT;
      case ARMPackage.REGISTER__R14:
        return r14 != R14_EDEFAULT;
      case ARMPackage.REGISTER__R15:
        return r15 != R15_EDEFAULT;
      case ARMPackage.REGISTER__RFP:
        return rfp != RFP_EDEFAULT;
      case ARMPackage.REGISTER__RIP:
        return rip != RIP_EDEFAULT;
      case ARMPackage.REGISTER__RSP:
        return rsp != RSP_EDEFAULT;
      case ARMPackage.REGISTER__RLR:
        return rlr != RLR_EDEFAULT;
      case ARMPackage.REGISTER__RPC:
        return rpc != RPC_EDEFAULT;
      case ARMPackage.REGISTER__R001:
        return r001 != R001_EDEFAULT;
      case ARMPackage.REGISTER__R01:
        return r01 != R01_EDEFAULT;
      case ARMPackage.REGISTER__R02:
        return r02 != R02_EDEFAULT;
      case ARMPackage.REGISTER__R03:
        return r03 != R03_EDEFAULT;
      case ARMPackage.REGISTER__R04:
        return r04 != R04_EDEFAULT;
      case ARMPackage.REGISTER__R05:
        return r05 != R05_EDEFAULT;
      case ARMPackage.REGISTER__R06:
        return r06 != R06_EDEFAULT;
      case ARMPackage.REGISTER__R07:
        return r07 != R07_EDEFAULT;
      case ARMPackage.REGISTER__R08:
        return r08 != R08_EDEFAULT;
      case ARMPackage.REGISTER__R09:
        return r09 != R09_EDEFAULT;
      case ARMPackage.REGISTER__R010:
        return r010 != R010_EDEFAULT;
      case ARMPackage.REGISTER__R011:
        return r011 != R011_EDEFAULT;
      case ARMPackage.REGISTER__R012:
        return r012 != R012_EDEFAULT;
      case ARMPackage.REGISTER__R013:
        return r013 != R013_EDEFAULT;
      case ARMPackage.REGISTER__R014:
        return r014 != R014_EDEFAULT;
      case ARMPackage.REGISTER__R015:
        return r015 != R015_EDEFAULT;
      case ARMPackage.REGISTER__R0FP:
        return r0FP != R0FP_EDEFAULT;
      case ARMPackage.REGISTER__R0IP:
        return r0IP != R0IP_EDEFAULT;
      case ARMPackage.REGISTER__R0SP:
        return r0SP != R0SP_EDEFAULT;
      case ARMPackage.REGISTER__R0LR:
        return r0LR != R0LR_EDEFAULT;
      case ARMPackage.REGISTER__R0PC:
        return r0PC != R0PC_EDEFAULT;
      case ARMPackage.REGISTER__OPSH:
        return opsh != null && !opsh.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == rs_sh.class)
    {
      switch (derivedFeatureID)
      {
        case ARMPackage.REGISTER__IMMEDIATE_LABEL: return ARMPackage.RS_SH__IMMEDIATE_LABEL;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == rs_sh.class)
    {
      switch (baseFeatureID)
      {
        case ARMPackage.RS_SH__IMMEDIATE_LABEL: return ARMPackage.REGISTER__IMMEDIATE_LABEL;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (r0: ");
    result.append(r0);
    result.append(", r1: ");
    result.append(r1);
    result.append(", r2: ");
    result.append(r2);
    result.append(", r3: ");
    result.append(r3);
    result.append(", r4: ");
    result.append(r4);
    result.append(", r5: ");
    result.append(r5);
    result.append(", r6: ");
    result.append(r6);
    result.append(", r7: ");
    result.append(r7);
    result.append(", r8: ");
    result.append(r8);
    result.append(", r9: ");
    result.append(r9);
    result.append(", r10: ");
    result.append(r10);
    result.append(", r11: ");
    result.append(r11);
    result.append(", r12: ");
    result.append(r12);
    result.append(", r13: ");
    result.append(r13);
    result.append(", r14: ");
    result.append(r14);
    result.append(", r15: ");
    result.append(r15);
    result.append(", rfp: ");
    result.append(rfp);
    result.append(", rip: ");
    result.append(rip);
    result.append(", rsp: ");
    result.append(rsp);
    result.append(", rlr: ");
    result.append(rlr);
    result.append(", rpc: ");
    result.append(rpc);
    result.append(", R001: ");
    result.append(r001);
    result.append(", R01: ");
    result.append(r01);
    result.append(", R02: ");
    result.append(r02);
    result.append(", R03: ");
    result.append(r03);
    result.append(", R04: ");
    result.append(r04);
    result.append(", R05: ");
    result.append(r05);
    result.append(", R06: ");
    result.append(r06);
    result.append(", R07: ");
    result.append(r07);
    result.append(", R08: ");
    result.append(r08);
    result.append(", R09: ");
    result.append(r09);
    result.append(", R010: ");
    result.append(r010);
    result.append(", R011: ");
    result.append(r011);
    result.append(", R012: ");
    result.append(r012);
    result.append(", R013: ");
    result.append(r013);
    result.append(", R014: ");
    result.append(r014);
    result.append(", R015: ");
    result.append(r015);
    result.append(", R0FP: ");
    result.append(r0FP);
    result.append(", R0IP: ");
    result.append(r0IP);
    result.append(", R0SP: ");
    result.append(r0SP);
    result.append(", R0LR: ");
    result.append(r0LR);
    result.append(", R0PC: ");
    result.append(r0PC);
    result.append(')');
    return result.toString();
  }

} //REGISTERImpl
