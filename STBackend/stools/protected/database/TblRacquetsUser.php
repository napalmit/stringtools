<?php
/**
 * Auto generated by prado-cli.php on 2013-11-15 02:24:29.
 */
class TblRacquetsUser extends TActiveRecord
{
	const TABLE='tbl_racquets_user';

	public $id;
	public $tbl_racquets_id;
	public $tbl_users_id;
	public $tbl_grip_size_id;
	public $serial;
	public $weight_unstrung;
	public $weight_strung;
	public $balance;
	public $swingweight;
	public $stiffness;
	public $date_buy;
	public $note;
	public $active;
	
	
	public $racquet;
	public $grip;
	

	public static function finder($className=__CLASS__)
	{
		return parent::finder($className);
	}
}
?>