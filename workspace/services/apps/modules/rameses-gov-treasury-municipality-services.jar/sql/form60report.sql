[getForm60Items]
select 
	fi.*, h.title as  parentitle, h.code as parentcode 
from form60setup fi
	inner join form60setup  h on fi.parentid = h.objid
where fi.type='item'
order by h.code, fi.code 

[getLiquidatedSummary1]
select 
   fa.parentid, sum(cri.amount) as total 
from collection_voucher l
  inner join liquidation_remittance lr on lr.liquidationid = l.objid 
  inner join remittance_cashreceipt rc on rc.remittanceid = lr.objid 
  inner join cashreceipt c on c.objid = rc.objid 
  inner join cashreceiptitem cri on cri.receiptid = c.objid
  inner join form60account fa on fa.revenueitemid = cri.item_objid 
  left join cashreceipt_void cv on cv.receiptid = c.objid 
where  l.dtposted between $P{fromdate} and $P{todate}  
    and cv.objid is null 
group by fa.parentid 

[getLiquidatedSummary]
SELECT 
   fa.parentid, SUM(cri.amount) AS total 
FROM collectionvoucher l
  INNER JOIN remittance lr ON lr.collectionvoucherid = l.objid 
  INNER JOIN cashreceipt rc ON rc.remittanceid = lr.objid 
  INNER JOIN cashreceipt c ON c.objid = rc.objid 
  INNER JOIN cashreceiptitem cri ON cri.receiptid = c.objid
  INNER JOIN form60account fa ON fa.revenueitemid = cri.item_objid 
  LEFT JOIN cashreceipt_void cv ON cv.receiptid = c.objid 
WHERE  YEAR(l.dtposted)=2019
    AND cv.objid IS NULL 
GROUP BY fa.parentid 