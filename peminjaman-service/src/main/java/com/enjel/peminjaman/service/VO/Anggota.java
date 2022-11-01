/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.enjel.peminjaman.service.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author acer
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Anggota {
   private Long anggotaId;
   private String nama;
   private String alamat;
}
