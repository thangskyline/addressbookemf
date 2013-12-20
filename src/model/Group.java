/**
 */
package model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Group#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends Entry {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link model.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see model.ModelPackage#getGroup_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entry> getEntries();

} // Group
