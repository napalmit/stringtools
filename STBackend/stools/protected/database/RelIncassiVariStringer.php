<?php
/**
 * Auto generated by prado-cli.php on 2013-11-15 09:58:32.
 */
class RelIncassiVariStringer extends TActiveRecord
{
	const TABLE='rel_incassi_vari_stringer';

	public $id;
	public $id_stringer;
	public $descrizione;
	public $valore_incasso;
	public $data;

	public static function finder($className=__CLASS__)
	{
		return parent::finder($className);
	}
}
?>